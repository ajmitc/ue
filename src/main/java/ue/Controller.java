package ue;

import ue.view.View;

import ue.game.*;

public class Controller{
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;

        view.getBtnWilderness().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.showWilderness();
            }
        });

        view.getBtnWorkshop().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.showWorkshop();
            }
        });
    }

    public void run(){
        checkGameOver();
        while (model.getGame().getPhase() != Phase.GAMEOVER){
            switch(model.getGame().getPhase()){
                case SETUP:{
                    switch(model.getGame().getPhaseStep()){
                        case START_PHASE:{
                            model.getGame().setPhaseStep(PhaseStep.END_PHASE);
                            break;
                        }
                        case END_PHASE:{
                            model.getGame().setPhase(PhaseStep.PLAY_CHOOSE_ACTION);
                            break;
                        }
                    }
                    break;
                }
                case PLAY_CHOOSE_ACTION:{
                    switch(model.getGame().getPhaseStep()){
                        case START_PHASE:{
                            model.getGame().setUserAction(null);
                            model.getGame().setPhaseStep(PhaseStep.END_PHASE);
                            break;
                        }
                        case END_PHASE:{
                            if (model.getGame().getUserAction() == null)
                                return;
                            if (model.getGame().getUserAction() == Action.SEARCH)
                                model.getGame().setPhase(PhaseStep.PLAY_SEARCH);
                            else if (model.getGame().getUserAction() == Action.REST){
                                // Spend one day to recover 1 HP
                                model.getGame().getTimeTrack().decDay();
                                model.getGame().adjHitpoints(1);
                                model.getGame().setPhaseStep(PhaseStep.START_PHASE);
                            }
                            break;
                        }
                    }
                    break;
                }
                case PLAY_SEARCH:{
                    switch(model.getGame().getPhaseStep()){
                        case START_PHASE:{
                            model.getGame().setPhaseStep(PhaseStep.END_PHASE);
                            break;
                        }
                        case END_PHASE:{
                            model.getGame().setPhase(Phase.PLAY_CHOOSE_ACTION);
                            break;
                        }
                    }
                    break;
                }
                case PLAY_COMBAT:{
                    switch(model.getGame().getPhaseStep()){
                        case START_PHASE:{
                            model.getGame().setPhaseStep(PhaseStep.END_PHASE);
                            break;
                        }
                        case END_PHASE:{
                            model.getGame().setPhase(PhaseStep.PLAY_CHOOSE_ACTION);
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    private void checkGameOver(){
        if (model.getGame().getTimeTrack().getDaysLeft() == 0)
            model.getGame().setPhase(Phase.GAMEOVER);
    }
}

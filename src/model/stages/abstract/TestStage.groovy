package model.stages.abstract

/**
* This class extends StageInfo so it has stageName and script, and implements Stage so he can override execute 
*/
abstract class TestStage extends StageInfo implements Stage  {
    
    TestStage(Object script, String stageName) {
        this.script = script
        this.stageName = stageName
    }
    
    @Override
    void execute() {
        info.script.stage(info.stageName) {
            info.script.echo "Hiho!"
        }
    }
}

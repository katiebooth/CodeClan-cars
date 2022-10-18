package car;

public class Engine {
    private String engineSize;
    private EngineType engineType;

    public Engine(String engineSize, EngineType engineType){
        this.engineSize = engineSize;
        this.engineType = engineType;
    }

    public String getEngineSize(){
        return engineSize;
    }

    public EngineType getEngineType(){
        return engineType;
    }
}

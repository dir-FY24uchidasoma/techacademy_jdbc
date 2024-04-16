package dbSample.entity;

public class Country {
    //フィールド
    private String name;
    private int population;
    
    //引数なしコンストラクタ
    public Country() {
        
    }
    
    //getter/setter
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public int getPopulation(){
        return population;
    }
    
    public void setPopulation(int population) {
    }
    

}

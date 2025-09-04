public class CreateObject extends Object{
    int id;
    String name;
    CreateObject(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return "( "+id+" "+name+" )";
    }
}

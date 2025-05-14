package Library;

public class Member{
    public String name;
    public int id;

    public void setinfo(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void getinfo(){
        System.out.println("Name of member is : "+name);
        System.out.println("Id of member is : "+id);
    }

}

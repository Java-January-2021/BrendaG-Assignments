public class Project{
    private String name;
    private String description;

    public String elevatorPitch(String name,String description){
        this.name = name;
        this.description = description;
        return name + ":" + description;
    }

    public  Project(){}

    public String Project(String name){
        this.name = name; 
        return name;
    }

    public String Project(String name, String description){
        this.name = name; 
        this.description = description;
        return name + "" + description;
    }

    public void setNameOfProject(String name){
        this.name = name; 
    }

    public void setDescriptionOfProject(String description){
        this.description = description;
    }

    public String getNameOfProject(){
        return this.name;
    }

    public String getDescriptionOfProject(){
        return this.description;
    }
}

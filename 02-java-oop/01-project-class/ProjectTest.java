class ProjectTest {
    public static void main(String[] args){
        Project proj = new Project();
        Project proj2 = new Project();

        proj2.setDescriptionOfProject("Coding is harder than it looks");
        proj2.setNameOfProject("Coding Dojo");

        String pitch = proj.elevatorPitch("Project", "Test If the Elevator Pitch is working");
        System.out.println(pitch);

        String coding = proj.Project("Learning Java");
        System.out.println(coding);

        String projNameAndDesc = proj.Project("Java ", " Its hard to learn!");
        System.out.println(projNameAndDesc);

        System.out.println(proj2.getNameOfProject());
        System.out.println(proj.getDescriptionOfProject());
        System.out.println(proj2.getDescriptionOfProject());


    }
}
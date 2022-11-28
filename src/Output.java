import java.util.List;

public class Output {
    public void showСhildren(Human arg, List<ObjectResearcheble> array){
        int searchId = arg.getId();
        int count = 0;
        System.out.println("We are looking for children from the subject =>" + arg.getName());
        for (int i = 0; i < array.size(); i++) {
            ObjectResearcheble person = array.get(i);
            if (person.getFather() != null) {
                if (person.getFather().getId() == searchId) {
                    count++;
                    System.out.println(String.
                            format("Child № %d - Surname: %s, Degree of kinship: %s ",
                                    count,person.getName(),
                                    (person.getTypeOfGender() == TypeOfGender.Male) ?
                                            TypeOfRelationship.Son : TypeOfRelationship.Daughter));
                }
            }
        }
        if (count == 0) System.out.println("There are no children");

    }

    public void showAllRelationship(Human person){
        List<DegreeOfKinship> array = person.getRelationShip();
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";

        int count = 0;
        System.out.println(ANSI_GREEN + "We are looking for RelationShip from the subject =>" + person.getName()+ ANSI_RESET);
        for (int i = 0; i < array.size(); i++) {
            count++;
            DegreeOfKinship temp  = array.get(i);
            System.out.println(String.
                    format("RelationShip № %d - Surname: %s, Degree of kinship: %s ",
                            count, temp.getPerson().getName(),temp.getType()));
        }
    }

}

package OOPS.EnumsExamples;

//Enums cannot be super class of any class, and Enums already inherit from java.lang.Enum so they can't extend any other class

public class Main {
    enum Week implements A{
        Monday("First day of the week"),
        Tuesday("Second day of the week"),
        Wednesday("Third day of the week"),
        Thursday("Fourth day of the week"),
        Friday("Fifth day of the week"),
        Saturday("Sixth day of the week"),
        Sunday("Seventh day of the week");
        //these are enum constants with brackets containing constructor arguments
        //In an enum, the constructor is defined once, but it is called for each enum constant. The arguments provided in the parentheses after each constant are passed to this single constructor. This allows each constant to be initialized with specific values.  Here is a brief explanation:
        //The enum constructor is defined once.
        //Each enum constant can have its own set of arguments.
        //These arguments are passed to the single constructor when the enum is initialized.
        //every member is public, static final
        //since its final we can't create child enums
        //type of all enum constants is Week

        private final String description;

        Week(String description) {
            this.description = description;
            System.out.println("Constructor called for : " + this.toString());
        }
        //constructor is not public or protected, it's only private or default
        //why?we don't want to create new objects of enum because this defeats the purpose of enum
        //internally: public static final Week Monday = new Week(); when the constructor is called

        public String getDescription() {
            return description;
        }
        //constructor is not public or protected, it's only private or default
        //why?we don't want to create new objects of enum because this defeats the purpose of enum

        //internally: public static final Week Monday = new Week(); when the constructor is called

        @Override
        public void hello() {
            System.out.println("Hello from Week");
        }

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
//        for(Week day: Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.valueOf("Monday"));
        System.out.println(week);
        System.out.println(week.getDescription());
    }


}

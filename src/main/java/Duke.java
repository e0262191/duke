import java.util.ArrayList;
import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String toexit = new String("bye");
        String toreturnlist = new String("list");
        String tick = new String("\u2713");
        String delete = new String("delete");
        String D = new String("D");
        String E = new String("E");
        String T = new String("T");
        ArrayList<String> listoftasks = new ArrayList<>();
        ArrayList<String> listofcompletedtasks = new ArrayList<>();
        int counttask = 0;
        int countcompletedtask = 0;

        System.out.println("Hello! I'm Duke\n" + "What can I do for you?");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter userinput,enter bye to quit,enter list to show Tasks");
        String userinput = in.nextLine();
        if (userinput.equals(toexit)) {
            System.exit(0);
        }
        while (!userinput.equals(toexit)) {
            String isDone;
            String typeoftask;
            String typeoftaskdatetime;
            Scanner inininin = new Scanner(System.in);
            System.out.print("Type of task - T, D, E");
            typeoftask = inininin.nextLine();
            Scanner inin = new Scanner(System.in);
            if ((!typeoftask.equals(D)) && (!typeoftask.equals(T)) && (!typeoftask.equals(E))) {
                System.out.print("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
                System.exit(0); //handle wrong user input
            } else {
                System.out.print("is " + userinput + " done? " + "\u2713" + " " + "\u2718");
                isDone = inin.nextLine(); // handle marking if task is done
                typeoftaskdatetime = "";
                if (typeoftask.equals(D)) {
                    Scanner qwe = new Scanner(System.in);
                    System.out.print("Date?");
                    typeoftaskdatetime = qwe.nextLine();
                }
                if (typeoftask.equals(E)) {
                    Scanner qwer = new Scanner(System.in);
                    System.out.print("Date and time?");
                    typeoftaskdatetime = qwer.nextLine();
                }
                userinput = "[" + typeoftask + "] " + "[" + isDone + "] " + userinput + " " + typeoftaskdatetime;
                if (isDone.equals(tick)) {
                    listofcompletedtasks.add(userinput);
                    listofcompletedtasks.add("\n");
                    countcompletedtask = countcompletedtask + 1;
                }
                listoftasks.add(userinput);
                listoftasks.add("\n");
                counttask = counttask + 1;
                Scanner ininin = new Scanner(System.in);
                System.out.println("Enter next userinput,enter bye to quit,enter list to see tasks");
                userinput = ininin.nextLine();
                if (userinput.equals(delete)) { //handle deleting task
                    Scanner qwerty = new Scanner(System.in);
                    System.out.println("Delete which task?");
                    String deletetask = qwerty.nextLine();
                    for (String item:listoftasks){
                        if (item.contains(deletetask)){
                            listoftasks.remove(item);
                            counttask = counttask -1;
                            listofcompletedtasks.remove(item);
                            countcompletedtask =countcompletedtask -1;
                            userinput = toreturnlist;
                        }
                    }
                }
                if (userinput.equals(toreturnlist)) {
                    System.out.println("Here are the " + counttask + " tasks in your list:" + "\n");
                    System.out.print(listoftasks);
                    System.out.println("\n");
                    System.out.println("Nice! I've marked " + countcompletedtask + " this task as done:" + "\n");
                    System.out.print(listofcompletedtasks);
                    System.out.println("\n" + "Bye. Hope to see you again soon!");
                    WriteStringToFile.Writetofile(listoftasks);
                    WriteStringToFile.Writetofile(listofcompletedtasks);
                } else {
                    continue;
                }
            }
        }
    }
}



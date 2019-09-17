package enumpractice;

public class Week {

    Days days;

    public Week(Days days) {
        this.days=days;
    }
    public void whatToDo() {
        switch (days) {
            case Saturday:
                System.out.println("working");
            case Sunday:
                System.out.println("fishing");
            case Monday:
                System.out.println("studying");
            case Tuesday:
                System.out.println("class");
            case Wednesday:
                System.out.println("gym");
            case Thursday:
                System.out.println("working");
            break;
            default:
                System.out.println("lala");
            break;
        }
    }
}

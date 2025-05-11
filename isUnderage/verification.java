package isUnderage;

public class verification {
    private int age;

    public verification(int age) {
        this.age = age;
    }

    public String isUnder18(){
        if(age<18){
            return "is underage";
        } else {
            return "isn't underage!";
        }
    }
}

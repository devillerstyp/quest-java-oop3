package questJavaoop3;
public  interface Fly {

     
    int ascend(int meters);

    int descend(int meters);
    
    void takeOff();

    default void glide() {
    System.out.println("It glides into the air.");
    }
    void land();

}  

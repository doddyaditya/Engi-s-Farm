public class CustomException extends Exception{
    //Constructor CustomException
    /**
     * @param msg
     */
    public CustomException(String msg){
        super(msg);
    }
    //Method overriding toString
    /**
     * @return Message
     */
    public String toString(){
        return super.getMessage();
    }
}
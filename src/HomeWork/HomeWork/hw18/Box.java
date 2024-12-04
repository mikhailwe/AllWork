package HomeWork.HomeWork.hw18;

public class Box <T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public boolean isEmpty() {
        return data == null;
    }
    public void clear(){
        data = null;
    }
}

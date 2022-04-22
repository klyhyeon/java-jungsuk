package ch09_;

public class Item13 implements Cloneable {

        public int i;
        public int[] arr; // array

        public Item13(int i, int[] arr){
            this.i = i;
            this.arr = arr;
        }

        public Item13 clone(){
            try{
                return (Item13) super.clone();
            }catch(CloneNotSupportedException e){
                throw new AssertionError();
            }
        }

    public Item13 copy(){
        try{
            Item13 result = (Item13) super.clone();
            result.arr = arr.clone();  // 스택의 내부정보를 복사한다. 배열의 clone을 호출해준다.
            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

}

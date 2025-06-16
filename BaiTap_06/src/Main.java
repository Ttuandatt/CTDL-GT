public class Main {

    public static <T> double tinhTBC(T[] arr){
        double sum = 0;

        for(int i=0;i<arr.length;i++){
            double value = Double.parseDouble(arr[i].toString());
            sum += value/arr.length;
        }

        return sum;
    }



    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};
        System.out.println("Trung binh cong intArr: " + tinhTBC(intArr));

        Double[] doubleArr = {4.0,5.5,3.2};
        System.out.println("Trung binh cong doubleArr: " + tinhTBC(doubleArr));
    }
}
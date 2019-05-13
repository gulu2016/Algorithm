/**
 * @ProjectName: Algorithm
 * @Package: PACKAGE_NAME
 * @ClassName: b2
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-5-13 下午6:34
 * @UpdateUser: 更新者
 * @UpdateDate: 19-5-13 下午6:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */


public class b2 {
    private static boolean less(int a,int b){
        return a<b;
    }
    private static void exchange(int[] a,int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void sort(int[] a){
        //默认按照升序排列
        int N = a.length;
        //对于每个数，如果该数小于左边的数，那么就和左边的数交换
        for(int i = 1;i < N;i++){
            for(int j = i;j > 0 && less(a[j],a[j-1]);j--){
                exchange(a,j,j-1);
            }
        }
    }



    public static void main(String[] args){
        int[] a = {2,4,2,0,1,4,9,2,3,2,2};
        sort(a);
        for(int i = 0;i < a.length;i++)
            System.out.println(a[i]+" ");
    }
}

/**
 * @ProjectName: Algorithm
 * @Package: PACKAGE_NAME
 * @ClassName: b1
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-5-12 下午4:59
 * @UpdateUser: 更新者
 * @UpdateDate: 19-5-12 下午4:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

/*
* 步骤：1,2
* */
public class b1 {
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
        for(int i = 0;i < N;i++){
            //1.每次都寻找最小的元素
            int min = i;
            for(int j = i+1;j < a.length;j++){
                if(less(a[j],a[min]))
                    min = j;
            }
            //2.将最小的元素与当前元素交换
            exchange(a,i,min);
        }
    }



    public static void main(String[] args){
        int[] a = {2,4,2,0,1,4,9,2,3,2,2};
        sort(a);
        for(int i = 0;i < a.length;i++)
            System.out.println(a[i]+" ");
    }
}

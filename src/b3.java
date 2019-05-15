/**
 * @ProjectName: Algorithm
 * @Package: PACKAGE_NAME
 * @ClassName: b3
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-5-15 下午9:10
 * @UpdateUser: 更新者
 * @UpdateDate: 19-5-15 下午9:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class b3 {
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
        int h = 1;
        while (h < N/3)
            h = 3*h+1;

        //步长不断减小，直到减小到1
        while (h >= 1){
            //将数组变为间隔为h的有序
            for(int i = h;i < N;i++){
                for(int j = i;j >= h&& less(a[j],a[j-h]);j-=h)
                    exchange(a,j,j-h);
            }
            h /= 3;
        }
    }

    public static void main(String[] args){
        int[] a = {2,4,2,0,1,4,9,2,3,2,2};
        sort(a);
        for(int i = 0;i < a.length;i++)
            System.out.println(a[i]+" ");
    }
}

/**
 * @ProjectName: Algorithm
 * @Package: PACKAGE_NAME
 * @ClassName: b4
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-5-16 上午11:26
 * @UpdateUser: 更新者
 * @UpdateDate: 19-5-16 上午11:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class b4 {
    //辅助数组空间
    private static int[] temp;

    private static boolean less(int a,int b){
        return a<b;
    }

    public static void sort(int[] a){
        temp = new int[a.length];
        sort(a,0,a.length-1);
    }

    public static void sort(int[] a,int low,int high){
        //将数组a[low...high]排序
        if(high <= low)
            return;
        int mid = low + (high-low)/2;
        sort(a,low,mid);
        sort(a,mid+1,high);
        merge(a,low,mid,high);
    }

    public static void merge(int[] a,int low,int mid,int high){
        //将a[low...mid]和a[mid+1,high]归并
        int i = low;
        int j = mid+1;

        for(int k = low;k <= high;k++)
            temp[k] = a[k];

        for (int k = low;k <= high;k++){
            //如果左半区已经归并完，直接从右半区取数
            if(i > mid)
                a[k] = temp[j++];
            //如果右半区已经归并完，直接从左半区取数
            else if(j > high)
                a[k] = temp[i++];
            //左右半区都有数，那么取两者较小的数
            else if(less(temp[j],temp[i]))
                a[k] = temp[j++];
            else
                a[k] = temp[i++];
        }
    }

    public static void main(String[] args){
        int[] a = {2,4,2,0,1,4,9,2,3,2,2};
        sort(a);
        for(int i = 0;i < a.length;i++)
            System.out.println(a[i]+" ");
    }
}

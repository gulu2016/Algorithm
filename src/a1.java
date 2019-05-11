import java.util.Arrays;

/**
 * @ProjectName: Algorithm
 * @Package: PACKAGE_NAME
 * @ClassName: a1
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-5-11 下午9:07
 * @UpdateUser: 更新者
 * @UpdateDate: 19-5-11 下午9:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class a1 {
    public static int binarySearch(int key,int[] a){
        //数组必须有序
        int low = 0;
        int high = a.length-1;
        //被查找的元素可能存在，可能不存在
        while (low <= high){
            //这样计算mid可以防止溢出
            int mid = low+(high-low)/2;
            if(key < a[mid])
                high = mid - 1;
            else if(key > a[mid])
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] list = {1,3,5,2,6,8};
        Arrays.sort(list);
        System.out.println(binarySearch(6,list));
    }
}

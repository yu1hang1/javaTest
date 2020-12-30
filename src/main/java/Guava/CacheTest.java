package Guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

/**
 * @program: Builder.test
 * @description:
 * guava Cache 缓存
 * @author: yuhang
 * @create: 2019-07-18 15:20
 **/
public class CacheTest {
    private static LoadingCache<Integer,String> cache;

    public static void main(String[] args) throws ExecutionException {
         testStats();

    }
    /**
     * guava Cache统计功能测试
     * */
    private static void testStats() throws ExecutionException {
        cache = CacheBuilder.newBuilder()
                .maximumSize(4)
                .recordStats()
                .build(new CacheLoader<Integer, String>() {
                    @Override
                    public String load(Integer key) throws Exception {
                        return String.valueOf(key);
                    }
                });
        cache.put(1,"s");
        cache.refresh(1);
        cache.refresh(2);
        cache.refresh(3);
        cache.refresh(4);
        cache.refresh(5);


        for (int i = 0;i<=5;i++){
            cache.get(i);
        }

        System.out.println(cache.stats().hitCount());//查缓存命中次数
        System.out.println(cache.stats().hitRate());//缓存命中率
        System.out.println(cache.stats().averageLoadPenalty());//平均加载时间
        System.out.println(cache.stats().evictionCount()); //自动回收次数,缓存被清除了多少次
    }
}

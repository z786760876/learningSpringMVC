package com.bjpowernode.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

//拦截器类:拦截用户的请求。
public class MyInterceptor implements HandlerInterceptor {
    private long beginTime = 0;

    /**
     * preHandle叫做预处理方法。
     * 重要:是整个项目的入口，门户。
     * 当preHandle返回true，请求可以被处理。
     * preHandle返回false，请求到此方法就截止。
     * <p>
     * 参数:
     * object handler :被拦截的控制器
     * 对象返回值boolean
     * true :
     * false :
     * <p>
     * 特点:
     * 1.方法在控制器方法（MyController的dosome ）之前先执行的。
     * 用户的请求首先到达此方法
     * 2.在这个方法中可以获取请求的信息，验证请求是否符合要求。
     * 可以验证用户是否登录，验证用户是否有权限访问某个连接地址(url )。
     * 如果验证失败，可以截断请求，请求不能被处理。
     * 如果验证成功，可以放行请求，此时控制器方法才能执行。
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        beginTime = System.currentTimeMillis();

        System.out.println("拦截器的MyInterceptor的preHandle()");

        //给浏览器一个返回结果
        //request.getRequestDispatcher("/tips.jsp").forward(request, response);

        return true;
    }

    /**
     * postHandle:后处理方法。参数:
     * object handler :被拦截的处理器对象Mycontroller
     * ModelAndView mv:处理器方法的返回值
     * <p>
     * 特点:
     * 1.在处理器方法之后执行的(MyController.dosome() )
     * 2.能够获取到处理器方法的返回值ModelAndview,可以修改NodelAndview中的数据和视图,可以影响到最后的执行结果。
     * 3.主要是对原来的执行结果做二次修正,
     */
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("拦截器的MyInterceptor的ppostHandle()");

        //对原来的dosome执行结果,需要调整。
        if (modelAndView != null) {
            //修改数据
            modelAndView.addObject("mydate", new Date());
            //修改视图
            modelAndView.setViewName("other");
        }
    }

    /**
     * aftercompletion:最后执行的方法
     * 参数:
     * object handler:被拦截器的处理器对象
     * Exception ex:程序中发生的异常
     * 特点:
     * 1.在请求处理完成后执行的。框架中规定是当你的视图处理完成后，对视图执行了forward。就认为请求处理完成。
     * 2.一般做资源回收工作的，程序请求过程中创建了一些对象，在这里可以删除，把占用的内存回收。
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截器的MyInterceptor的afterCompletion()");

        long endTime = System.currentTimeMillis();
        long time = endTime - beginTime;

        System.out.println("计算从preHandle到请求处理完成的时间:" + time);
    }
}

package cifz.com.testpath;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 测试基本path
 * Created by wangzhen on 2018/2/12.
 */

public class PathView extends View {

    private Paint mPaint;
    private Path mPath;

    public PathView(Context context) {
        super(context);
        initView();
    }

    public PathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public void initView(){
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
        // 实例化路径
        mPath = new Path();
//        mPath.moveTo(100, 100);
        // 连接路径到点
        mPath.lineTo(100, 0);
        mPath.lineTo(200, 100);
        mPath.lineTo(0, 100);
        mPath.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 绘制路径
        canvas.drawPath(mPath, mPaint);
    }
}

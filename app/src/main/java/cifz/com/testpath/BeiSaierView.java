package cifz.com.testpath;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 绘制贝塞尔 曲线
 * Created by wangzhen on 2018/2/12.
 */

public class BeiSaierView extends View {

    private Paint mPaint;
    private Path mPath;

    public BeiSaierView(Context context) {
        super(context);
        initView();
    }

    public BeiSaierView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public BeiSaierView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public void initView(){
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
        mPaint.setAntiAlias(true);
        char b[] = new char[]{'a','b'};
        String a = new String(b);
        Log.e("BeiSaierView",a);
        // 实例化路径
        mPath = new Path();
        mPath.moveTo(100, 100);
        //绘制二阶贝塞尔曲线
//        mPath.quadTo(200,200,400,100);
        // 绘制三阶贝塞尔曲线
        mPath.cubicTo(200, 200, 300, 0, 400, 100);
        mPath.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(mPath,mPaint);
    }

    @Nullable
    @Override
    protected Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();

    }
}

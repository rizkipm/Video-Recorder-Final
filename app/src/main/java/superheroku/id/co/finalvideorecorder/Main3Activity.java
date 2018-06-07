//package superheroku.id.co.finalvideorecorder;
//
//import android.hardware.camera2.CameraAccessException;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.Toast;
//
//import java.util.concurrent.TimeUnit;
//
//public class Main3Activity extends AppCompatActivity {
//
//
//    String cameraId;  // take this cameraId as global
//
//    public static String ROTATE = null;
//
//
//    ImageView ivRotateFront, ivRotateBack;
//    AutoFitTextureView mTextureView;
//
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//        mTextureView = (AutoFitTextureView) findViewById(R.id.texture);
//        mButtonVideo = (Button) view.findViewById(R.id.video);
//        ivRotateFront = (ImageView)view.findViewById(R.id.iv_rotate_front);
//        ivRotateBack = (ImageView)view.findViewById(R.id.iv_rotate_back);
//
//
//        mButtonVideo.setOnClickListener(this);
//        ivRotateFront.setOnClickListener(this);
//        ivRotateBack.setOnClickListener(this);
//        view.findViewById(R.id.info).setOnClickListener(this);
//    }
//
//
//
//     case R.id.iv_rotate_front: {
//
//
//        ivRotateFront.setVisibility(View.GONE);
//        ivRotateBack.setVisibility(View.VISIBLE);
//
//        closeCamera();
//        stopBackgroundThread();
//
//        startBackgroundThread();
//        if (mTextureView.isAvailable()) {
//
//            ROTATE = "fulfilled";
//
//            Log.e("Rotate", ""+ROTATE);
//
//            openCamera(mTextureView.getWidth(), mTextureView.getHeight());
//
//
//
//        } else {
//            mTextureView.setSurfaceTextureListener(mSurfaceTextureListener);
//        }
//
//
//
//
//        break;
//    }
//
//            case R.id.iv_rotate_back: {
//
//        Log.e("ClickBack", "Test");
//
//        ivRotateFront.setVisibility(View.VISIBLE);
//        ivRotateBack.setVisibility(View.GONE);
//
//        closeCamera();
//        stopBackgroundThread();
//
//        startBackgroundThread();
//        if (mTextureView.isAvailable()) {
//            openCamera(mTextureView.getWidth(), mTextureView.getHeight());
//        } else {
//            mTextureView.setSurfaceTextureListener(mSurfaceTextureListener);
//        }
//
//
//
//        break;
//    }
//
//
//
//      case R.id.video: {
//        if (mIsRecordingVideo) {
//
//            ivRotateBack.setClickable(true);
//            ivRotateFront.setClickable(true);
//
//            stopRecordingVideo();
//
//
//        } else {
//
//            ivRotateBack.setClickable(false);
//            ivRotateFront.setClickable(false);
//
//            startRecordingVideo();
//        }
//        break;
//    }
//
//
//    private void openCamera(int width, int height) {
//
//        try {
//
//            if (!mCameraOpenCloseLock.tryAcquire(2500, TimeUnit.MILLISECONDS)) {
//                throw new RuntimeException("Time out waiting to lock camera opening.");
//            }
//
//            if(ROTATE != null){
//
//                Log.e("FrontCamera", "Test");
//
//                cameraId = manager.getCameraIdList()[1];
//
//                ROTATE = null;
//
//            } else {
//
//                Log.e("BackCamera", "Test");
//
//                cameraId = manager.getCameraIdList()[0];
//
//            }
//
//
//        } catch (CameraAccessException e) {
//            Toast.makeText(activity, "Cannot access the camera.", Toast.LENGTH_SHORT).show();
//            activity.finish();
//        }
//
//    }

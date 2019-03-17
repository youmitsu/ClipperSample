package jp.co.youmitsu.ClippableLayoutTestApp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import jp.co.youmeee.clipper.CircleClipEntry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

//        // The target view for clipping.
        val entry = CircleClipEntry(fab, resources.getDimensionPixelSize(R.dimen.fab_margin))
        val entry2 = CircleClipEntry(fab)
//        // The view for description.
//        val descLayout = layoutInflater.inflate(R.layout.tutorial_view_first, null)
//        val cl2 = ClipperLayout(this).also {
//            // Initialize and set config
//            it.add(entry)
//            it.descView = DescriptionView(descLayout, R.id.next_button)
//        }
//        cl2.clip(container, window)  // execute clip


//        val cl1 = ClipperLayout(this).also { it.add(entry) }
//        // Bundle multiple ClipperLayout and execute in order
//        Clipper.createBundleExecutor(
//            container, window, null, cl1
//        ).execute()

//        val descView = layoutInflater.inflate(R.layout.tutorial_view_first, null)
//        ClipperLayout(this).also { cl ->
//            cl.add(CircleClipEntry(fab, resources.getDimensionPixelSize(R.dimen.fab_margin)))
//            cl.descView = DescriptionView(descView, R.id.next_button)
//        }.clip(container, window, CircleRevealClipAnimator())


//        val cl2 = ClipperLayout(this).also { cl2 ->
//            cl2.add(RectClipEntry(fab, resources.getDimensionPixelSize(R.dimen.fab_margin)))
//            cl2.descView = DescriptionView(descView, R.id.next_button)
//        }
//        Clipper.createBundleExecutor(
//            container,
//            window,
//            CircleRevealClipAnimator(),
//            cl2
//        ).execute()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }
}

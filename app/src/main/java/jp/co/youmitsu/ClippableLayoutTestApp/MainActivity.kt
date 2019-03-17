package jp.co.youmitsu.ClippableLayoutTestApp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import jp.co.youmeee.clipper.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val descView = layoutInflater.inflate(R.layout.tutorial_view_first, null)
        val cl1 = ClipperLayout(this).also { cl ->
            cl.add(CircleClipEntry(fab, resources.getDimensionPixelSize(R.dimen.fab_margin)))
            cl.descView = DescriptionView(descView, R.id.next_button)
            cl.clipAnimator = CircleRevealClipAnimator()
        }
        Clipper.createBundleExecutor(container, window, cl1).execute()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }
}

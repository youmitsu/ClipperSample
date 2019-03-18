package jp.co.youmitsu.ClippableLayoutTestApp

import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.Menu
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import jp.co.youmeee.clipper.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val descriptionView: View by lazy {
        layoutInflater.inflate(R.layout.tutorial_view_first, null)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        showClipper()
    }

    private fun getDescriptionView(text: String): DescriptionView {
        descriptionView.findViewById<TextView>(R.id.text).text = text
        return DescriptionView(
            descriptionView,
            R.id.next_button,
            gravity = Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL,
            leftMargin = resources.getDimensionPixelSize(R.dimen.tutorial_side_margin),
            rightMargin = resources.getDimensionPixelSize(R.dimen.tutorial_side_margin),
            bottomMargin = resources.getDimensionPixelSize(R.dimen.tutorial_botom_margin)
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    private fun showClipper() {
        val cl1 = ClipperLayout(this, getDescriptionView(resources.getString(R.string.description_text1)))
            .addEntry(CircleClipEntry(fab, resources.getDimensionPixelSize(R.dimen.fab_margin)))
        val executor: ClipBundleExecutor = Clipper.createBundleExecutor(container, window, null, cl1)
        Handler().postDelayed({
            executor.execute()
        }, 500)
    }
}

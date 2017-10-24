package com.jiahaozhang.mooddiary.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import butterknife.ButterKnife;
import butterknife.InjectView;

//import com.liaobb.evernote.R;
import com.jiahaozhang.mooddiary.R;
//import com.jiahaozhang.mooddiary.R;


/**
 * Created by acanprince on 2017/5/22.
 */

public abstract class ToolbarActivity  extends AppCompatActivity{
        @InjectView(R.id.toolbar)
        Toolbar toolbar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(getLayoutView());

                ButterKnife.inject(this);

                initToolbar(getToolbarTitle());
        }

        private void initToolbar(String toolBarTitle) {
                toolbar.setTitle(toolBarTitle);//…Ë÷√±ÍÃ‚
                setSupportActionBar(toolbar);
                if (getSupportActionBar() != null) {
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                }
                toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
                if (item.getItemId() == android.R.id.home) {
                        finish();
                        return true;
                }
                return super.onOptionsItemSelected(item);
        }

        protected abstract String getToolbarTitle();

        protected abstract int getLayoutView();
}

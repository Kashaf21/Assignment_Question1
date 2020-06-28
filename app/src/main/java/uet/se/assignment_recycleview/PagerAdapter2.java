package uet.se.assignment_recycleview;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter2 extends FragmentStatePagerAdapter {
        int noOfTabs;

        public PagerAdapter2(FragmentManager fm, int NumberOfTabs){
            super(fm);
            this.noOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {

            if(position == 0){
                Jobs2 jobs = new Jobs2();
                return jobs;
            }
            else if(position == 1){
                Comapanies comapanies = new Comapanies();
                return comapanies;
            }
            else if(position == 2){
                Salaries salaries = new Salaries();
                return salaries;
            }
            else{
                return null;
            }
        }
        @Override
        public int getCount() {
            return noOfTabs;
        }
    }


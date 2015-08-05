package blackbutterfly.in.blackbutterfly;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by BB3 on 8/5/2015.
 */
public class ServicesFragment extends Fragment {

    ArrayAdapter<String> servicesAdapter;

    public ServicesFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] servicesArray = {
                "Website Designing",
                "Android Application Development",
                "Internet Marketing",
                "Software Development",
        };

        List<String> services = new ArrayList<String>(Arrays.asList(servicesArray));

        servicesAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_news,
                R.id.list_item_news_textview,
                services);

        View rootview = inflater.inflate(R.layout.fragment_services, container, false);

        ListView listView = (ListView) rootview.findViewById(R.id.list_item_services);
        listView.setAdapter(servicesAdapter);

        return rootview;

    }

}

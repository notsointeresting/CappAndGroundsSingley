package com.notsointeresting.cappandgrounds;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TwitterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TwitterFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TwitterFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TwitterFragment newInstance(String param1, String param2) {
        TwitterFragment fragment = new TwitterFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public TwitterFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        if (!DetectConnection.checkInternetConnection(this.getActivity())) {
            Toast.makeText(getActivity(), "No Internet!", Toast.LENGTH_SHORT).show();
            View rootView = (View) inflater.inflate(R.layout.no_internet, container, false);


            return rootView;


        } else {
            View rootView = inflater.inflate(R.layout.fragment_order, container, false);
            webView = (WebView) rootView.findViewById(R.id.resource1);


            CookieManager.getInstance().setAcceptCookie(true);
            webView.setWebViewClient(new WebViewClient() {

            });
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setDisplayZoomControls(false);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            webView.getSettings().setSavePassword(true);
            webView.getSettings().setAppCacheEnabled(true);
            webView.getSettings().setAppCacheMaxSize(5);
            webView.loadUrl("https://twitter.com/Capp_and_Ground");


            return rootView;
        }


    }
}

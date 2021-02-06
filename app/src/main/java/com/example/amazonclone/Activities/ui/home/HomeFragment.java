package com.example.amazonclone.Activities.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.amazonclone.Activities.GroceryActivity;
import com.example.amazonclone.Activities.MobileActivity;
import com.example.amazonclone.R;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private ImageView MivMobileButton, MivGroceryButton;
    private Button mBtnSeeAll;
    private HomeViewModel homeViewModel;
    private Toolbar toolbar;

//    int[] images = {R.drawable.imageone, R.drawable.imagetwo, R.drawable.imagethree};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        return root;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       initView(view);
    }

    private void initView(View view) {
        ImageSlider imageSlider = view.findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.imagesoffer,""));
        slideModels.add(new SlideModel(R.drawable.imagesix,""));
        slideModels.add(new SlideModel(R.drawable.imagesfivee,""));
        slideModels.add(new SlideModel(R.drawable.lol,""));
        slideModels.add(new SlideModel(R.drawable.imagesfivee,""));
        slideModels.add(new SlideModel(R.drawable.lolt,""));
        slideModels.add(new SlideModel(R.drawable.lolthree,""));
        slideModels.add(new SlideModel(R.drawable.lolfour,""));
        slideModels.add(new SlideModel(R.drawable.imagefour,""));
        slideModels.add(new SlideModel(R.drawable.imagesix,""));
        imageSlider.setImageList(slideModels,true);
        MivMobileButton = view.findViewById(R.id.ivMobileIcon);
        mBtnSeeAll = view.findViewById(R.id.btnSeeAll);

        MivGroceryButton = view.findViewById(R.id.ivGroceryHome);
        MivMobileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MobileActivity.class);
                startActivity(intent);
            }
        });
        mBtnSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inentTwo = new Intent(getActivity(),MobileActivity.class);
                startActivity(inentTwo);
            }
        });
        MivGroceryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentThree = new Intent(getActivity(), GroceryActivity.class);
                startActivity(intentThree);
            }
        });

    }

}














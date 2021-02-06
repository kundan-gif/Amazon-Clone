package com.example.amazonclone.Activities.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.amazonclone.Activities.ElectronicsActivity;
import com.example.amazonclone.Activities.FashionActivity;
import com.example.amazonclone.R;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Toolbar toolbar;
    private ImageView mIvFashionLogo;
    private ImageView mIvElectronicsLogo;

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
        initViews(view);
    }

    private void initViews(View view) {
        mIvFashionLogo=view.findViewById(R.id.ivFashionLogo);
        mIvElectronicsLogo=view.findViewById(R.id.ElectronicsLogo);
        mIvFashionLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), FashionActivity.class);
                startActivity(intent);
            }
        });
        mIvElectronicsLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ElectronicsActivity.class);
                startActivity(intent);
            }
        });
    }

}














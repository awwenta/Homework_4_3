package com.sultan.homework_4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sultan.homework_4_3.databinding.FragmentCountryBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {

    private FragmentCountryBinding binding;
    private ArrayList<Country> countryList;
    private CountryAdapter adapter;
    private Integer position;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("key");

        checkPosition(position);

        adapter = new CountryAdapter(countryList);
        binding.recyclerView.setAdapter(adapter);
    }

    private void checkPosition(Integer position) {
        if (position == 0) {
            loadEurasia();
        } else if (position == 1) {
            loadNorthAmerica();
        } else if (position == 2) {
            loadSouthAmerica();
        } else if (position == 3) {
            loadAfrica();
        } else if (position == 4) {
            loadAustralia();
        }
    }

    private void loadAustralia() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Australia", "Canberra", "https://upload.wikimedia.org/wikipedia/commons/8/88/Flag_of_Australia_%28converted%29.svg"));
    }

    private void loadAfrica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Lesotho", "Masera", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4a/Flag_of_Lesotho.svg/250px-Flag_of_Lesotho.svg.png"));
        countryList.add(new Country("Botswana", "Gaborone", "https://upload.wikimedia.org/wikipedia/commons/f/fa/Flag_of_Botswana.svg"));
        countryList.add(new Country("Namibia", "Windhoek", "https://upload.wikimedia.org/wikipedia/commons/0/00/Flag_of_Namibia.svg"));
        countryList.add(new Country("Burundi", "Gitega", "https://cdn.britannica.com/77/7177-004-9D72922D/Flag-Burundi.jpg"));
        countryList.add(new Country("Uganda", "Kampala", "https://cdn.britannica.com/22/22-004-0165975D/Flag-Uganda.jpg"));
        countryList.add(new Country("Zimbabwe", "Harare", "https://cdn.britannica.com/33/4233-004-30998E1D/Flag-Zimbabwe.jpg"));
        countryList.add(new Country("Zambia", "Lusaka", "https://cdn.britannica.com/31/4231-004-F1DBFAE7/Flag-Zambia.jpg"));
        countryList.add(new Country("Malawi", "Lilognwe", "https://upload.wikimedia.org/wikipedia/commons/d/d1/Flag_of_Malawi.svg"));
        countryList.add(new Country("Mozambique", "Maputo", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Flag_of_Mozambique.svg/800px-Flag_of_Mozambique.svg.png?20221128231813"));
        countryList.add(new Country("Ethiopia", "Addis Ababa", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Flag_of_Ethiopia.svg/2560px-Flag_of_Ethiopia.svg.png"));

    }

    private void loadSouthAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Brazil", "Brazilia", "https://upload.wikimedia.org/wikipedia/en/thumb/0/05/Flag_of_Brazil.svg/640px-Flag_of_Brazil.svg.png"));
        countryList.add(new Country("Peru", "Lima", "https://cdn.britannica.com/48/3448-004-33B5D198/Flag-Peru.jpg"));
        countryList.add(new Country("Argentina", "Buenos Aires", "https://cdn.britannica.com/69/5869-004-7D75CD05/Flag-Argentina.jpg"));
        countryList.add(new Country("Uruguay", "Montevideo", "https://upload.wikimedia.org/wikipedia/commons/f/fe/Flag_of_Uruguay.svg"));
        countryList.add(new Country("Chile", "Santiago", "https://cdn.britannica.com/85/7485-004-00B07230/Flag-Chile.jpg"));
        countryList.add(new Country("Ecuador", "Quito", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e8/Flag_of_Ecuador.svg/800px-Flag_of_Ecuador.svg.png?20140720204051"));
        countryList.add(new Country("Bolivia", "La Paz", "https://cdn.britannica.com/54/6754-004-AE3C4294/Flag-Bolivia.jpg"));
        countryList.add(new Country("Guyana", "Georgetown", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Flag_of_Guyana.svg/1200px-Flag_of_Guyana.svg.png"));
        countryList.add(new Country("Suriname", "Paramaribo", "https://cdn.britannica.com/20/4520-004-F090B3C8/Flag-Suriname.jpg"));
        countryList.add(new Country("Paraguay", "Asuncion", "https://upload.wikimedia.org/wikipedia/commons/2/27/Flag_of_Paraguay.svg"));
    }

    private void loadNorthAmerica() {
        countryList = new ArrayList<>();
        countryList.add(new Country("USA", "Washington", "https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1200px-Flag_of_the_United_States.svg.png"));
        countryList.add(new Country("Mexico", "Mexico", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Flag_of_Mexico.svg/1200px-Flag_of_Mexico.svg.png"));
        countryList.add(new Country("Canada", "Ottawa", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Flag_of_Canada_%28Pantone%29.svg"));
        countryList.add(new Country("Cuba", "Havana", "https://upload.wikimedia.org/wikipedia/commons/b/bd/Flag_of_Cuba.svg"));
        countryList.add(new Country("Costa Rica", "San Jose", "https://cdn.britannica.com/25/7225-004-65F33B16/Flag-Costa-Rica.jpg"));
        countryList.add(new Country("Panama", "Panama", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Flag_of_Panama.svg/1200px-Flag_of_Panama.svg.png"));
        countryList.add(new Country("Honduras", "Tegucigalpa", "https://cdn.britannica.com/16/7216-004-F1400CA0/Flag-Honduras.jpg"));
        countryList.add(new Country("Jamaica", "Kingston", "https://upload.wikimedia.org/wikipedia/commons/0/0a/Flag_of_Jamaica.svg"));
        countryList.add(new Country("Trinidad and Tobago", "Port of Spain", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Flag_of_Trinidad_and_Tobago.svg/2560px-Flag_of_Trinidad_and_Tobago.svg.png"));
        countryList.add(new Country("Guatemala", "Guatemala", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Flag_of_Guatemala.svg/1280px-Flag_of_Guatemala.svg.png"));
    }

    private void loadEurasia() {
        countryList = new ArrayList<>();
        countryList.add(new Country("Russia", "Moscow", "https://cdn.britannica.com/42/3842-004-F47B77BC/Flag-Russia.jpg"));
        countryList.add(new Country("France", "Paris", "https://cdn.britannica.com/82/682-050-8AA3D6A6/Flag-France.jpg?w=400&h=235&c=crop"));
        countryList.add(new Country("United Kingdom", "London", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/1200px-Flag_of_the_United_Kingdom_%281-2%29.svg.png"));
        countryList.add(new Country("Germany", "Berlin", "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/1200px-Flag_of_Germany.svg.png"));
        countryList.add(new Country("Slovakia", "Bratislava", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Flag_of_Slovakia.svg/2560px-Flag_of_Slovakia.svg.png"));
        countryList.add(new Country("Czech", "Prague", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Flag_of_the_Czech_Republic_%28bordered%29.svg/2560px-Flag_of_the_Czech_Republic_%28bordered%29.svg.png"));
        countryList.add(new Country("Honduras", "Tegucigalpa", "https://cdn.britannica.com/16/7216-004-F1400CA0/Flag-Honduras.jpg"));
        countryList.add(new Country("Poland", "Warsaw", "https://upload.wikimedia.org/wikipedia/en/thumb/1/12/Flag_of_Poland.svg/1200px-Flag_of_Poland.svg.png"));
        countryList.add(new Country("Estonia", "Tallinn", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Flag_of_Estonia.svg/2560px-Flag_of_Estonia.svg.png"));
        countryList.add(new Country("China", "Beijing", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Flag_of_the_People%27s_Republic_of_China.svg/1280px-Flag_of_the_People%27s_Republic_of_China.svg.png"));
    }
}
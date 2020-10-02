package com.example.pets.data;

import android.provider.BaseColumns;

public final class PetsContract {
    private PetsContract(){ }
    public static final class PetEntry implements
            BaseColumns{
        public final static String table="pets";
        public final static String table_id=BaseColumns._ID;
        public final static String petname="name";
        public final static String breed="breed";
        public final static String gender="gender";
        public final static String weight="weight";

        public final static int genderu=0;
        public final static int genderm=1;
        public final static int genderf=2;


    }
}

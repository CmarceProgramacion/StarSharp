package com.starsharp.utils;

public enum AccessList {
    URL_PLATFORM("https://serenity.is/demo/");

        private String url;

        AccessList(String url) {
            this.url = url;
        }

        public String getUrl(){
            return url;
        }
    }



package com.prokarma.bustest.model;

import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("next_page")
    private int nextPage;

    @SerializedName("per_page")
    private int perPage;

    @SerializedName("total_count")
    private int totalCount;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("current_page")
    private int currentPage;

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return
                "Meta{" +
                        "next_page = '" + nextPage + '\'' +
                        ",per_page = '" + perPage + '\'' +
                        ",total_count = '" + totalCount + '\'' +
                        ",total_pages = '" + totalPages + '\'' +
                        ",current_page = '" + currentPage + '\'' +
                        "}";
    }
}
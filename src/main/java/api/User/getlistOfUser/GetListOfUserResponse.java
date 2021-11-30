package api.User.getlistOfUser;

import java.util.List;

import lombok.Getter;

public @Getter
class GetListOfUserResponse{
	private Integer page;
	private Integer per_page;
	private Integer total;
	private Integer total_pages;
	private List<DataItem> data;
	private Support support;
}
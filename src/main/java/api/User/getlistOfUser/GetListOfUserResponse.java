package api.User.getlistOfUser;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

public @Getter
class GetListOfUserResponse{
	private Integer page;
	@SerializedName("per_page")
	@Expose
	private Integer perPage;
	private Integer total;
	@SerializedName("total_pages")
	@Expose
	private Integer totalPages;
	private List<DataItem> data;
	private Support support;
}
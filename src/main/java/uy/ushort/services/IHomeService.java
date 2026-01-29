package uy.ushort.services;

import uy.ushort.data.LinkRequest;
import uy.ushort.data.LinkResponse;

import java.util.List;

public interface IHomeService {
    public List<LinkResponse> homeResponse();
    public String getLargeURL(String path);
    public LinkResponse create(LinkRequest url);
}

package com.demo.slk.application.esshopifybacthprocesing.batch.reader;

import java.util.List;

import com.demo.slk.application.esshopifybacthprocesing.batch.pojo.system.DataItemRead;

public interface ProductDataReader<T> extends DataReader<T> {
	@SuppressWarnings("hiding")
	public <T extends DataItemRead> T productById() throws Exception;

	@SuppressWarnings("hiding")
	public <T extends DataItemRead> List<T> productByCollectionId(String collectionId) throws Exception;

	@SuppressWarnings("hiding")
	public <T extends DataItemRead> List<T> productByRangeAndCollectionId(int start, int end, String collectionid) throws Exception;

}

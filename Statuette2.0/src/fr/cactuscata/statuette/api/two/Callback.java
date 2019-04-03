package fr.cactuscata.statuette.api.two;

import javax.annotation.Nullable;

public interface Callback<V> {

	void done(@Nullable V result, @Nullable Throwable error);
}
package org.simpleflatmapper.jdbc.impl.getter;

import org.simpleflatmapper.converter.Context;
import org.simpleflatmapper.map.getter.ContextualGetter;
import org.simpleflatmapper.reflect.Getter;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class NStringResultSetGetter implements Getter<ResultSet, String>, ContextualGetter<ResultSet, String> {
	private final int column;
	
	public NStringResultSetGetter(final int column) {
		this.column = column;
	}

	public String get(final ResultSet target) throws SQLException {
		return target.getNString(column);
	}

	@Override
	public String get(ResultSet resultSet, Context context) throws Exception {
		return get(resultSet);
	}

	@Override
    public String toString() {
        return "NStringResultSetGetter{" +
                "property=" + column +
                '}';
    }
}

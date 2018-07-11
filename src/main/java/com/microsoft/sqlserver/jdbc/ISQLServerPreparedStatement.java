/*
 * Microsoft JDBC Driver for SQL Server Copyright(c) Microsoft Corporation All rights reserved. This program is made
 * available under the terms of the MIT License. See the LICENSE file in the project root for more information.
 */

package com.microsoft.sqlserver.jdbc;

import java.math.BigDecimal;
import java.sql.ParameterMetaData;
import java.sql.ResultSet;
import java.sql.SQLType;


/**
 * This interface is implemented by {@link SQLServerPreparedStatement} class.
 */
public interface ISQLServerPreparedStatement extends java.sql.PreparedStatement, ISQLServerStatement {
    /**
     * Sets the designated parameter to the given <code>microsoft.sql.DateTimeOffset</code> value.
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @throws SQLServerException
     *         if parameterIndex does not correspond to a parameter marker in the SQL statement; if a database access
     *         error occurs or this method is called on a closed <code>PreparedStatement</code>
     */
    public void setDateTimeOffset(int parameterIndex, microsoft.sql.DateTimeOffset x) throws SQLServerException;

    /**
     * Sets the value of the designated parameter with the given object.
     *
     * This method is similar to
     * {@link #setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength)}, except that it
     * assumes a scale of zero.
     * <P>
     * The default implementation will throw {@code SQLFeatureNotSupportedException}
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the object containing the input parameter value
     * @param targetSqlType
     *        the SQL type to be sent to the database
     * @param precision
     *        the precision of the column
     * @param scale
     *        the scale of the column
     * @throws SQLServerException
     *         if parameterIndex does not correspond to a parameter marker in the SQL statement; if a database access
     *         error occurs or this method is called on a closed {@code PreparedStatement}
     */
    public void setObject(int parameterIndex, Object x, SQLType targetSqlType, Integer precision,
            Integer scale) throws SQLServerException;

    /**
     * Sets the value of the designated parameter with the given object.
     *
     * This method is similar to
     * {@link #setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength)}, except that it
     * assumes a scale of zero.
     * <P>
     * The default implementation will throw {@code SQLFeatureNotSupportedException}
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the object containing the input parameter value
     * @param targetSqlType
     *        the SQL type to be sent to the database
     * @param precision
     *        the precision of the column
     * @param scale
     *        the scale of the column
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         if parameterIndex does not correspond to a parameter marker in the SQL statement; if a database access
     *         error occurs or this method is called on a closed {@code PreparedStatement}
     */
    public void setObject(int parameterIndex, Object x, SQLType targetSqlType, Integer precision, Integer scale,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * The server handle for this prepared statement. If a value {@literal <} 1 is returned no handle has been created.
     * 
     * @return Per the description.
     * @throws SQLServerException
     *         when an error occurs
     */
    public int getPreparedStatementHandle() throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.math.BigDecimal</code> value. The driver converts this to
     * an SQL <code>NUMERIC</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param precision
     *        the precision of the column
     * @param scale
     *        the scale of the column
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setBigDecimal(int parameterIndex, BigDecimal x, int precision, int scale) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.math.BigDecimal</code> value. The driver converts this to
     * an SQL <code>NUMERIC</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param precision
     *        the precision of the column
     * @param scale
     *        the scale of the column
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setBigDecimal(int parameterIndex, BigDecimal x, int precision, int scale,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.math.BigDecimal</code> value. The driver converts this to
     * an SQL <code>NUMERIC</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setMoney(int parameterIndex, BigDecimal x) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.math.BigDecimal</code> value. The driver converts this to
     * an SQL <code>NUMERIC</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setMoney(int parameterIndex, BigDecimal x, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.math.BigDecimal</code> value. The driver converts this to
     * an SQL <code>NUMERIC</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setSmallMoney(int parameterIndex, BigDecimal x) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.math.BigDecimal</code> value. The driver converts this to
     * an SQL <code>NUMERIC</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setSmallMoney(int parameterIndex, BigDecimal x, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java <code>boolean</code> value. The driver converts this to an SQL
     * <code>BIT</code> or <code>BOOLEAN</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setBoolean(int parameterIndex, boolean x, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java <code>byte</code> value. The driver converts this to an SQL
     * <code>TINYINT</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setByte(int parameterIndex, byte x, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java array of bytes. The driver converts this to an SQL
     * <code>VARBINARY</code> or <code>LONGVARBINARY</code> (depending on the argument's size relative to the driver's
     * limits on <code>VARBINARY</code> values) when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setBytes(int parameterIndex, byte x[], boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given String. The driver converts this to an SQL <code>GUID</code>
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param guid
     *        string representation of the uniqueIdentifier value
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setUniqueIdentifier(int parameterIndex, String guid) throws SQLServerException;

    /**
     * Sets the designated parameter to the given String. The driver converts this to an SQL <code>GUID</code>
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param guid
     *        string representation of the uniqueIdentifier value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setUniqueIdentifier(int parameterIndex, String guid, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java <code>double</code> value. The driver converts this to an SQL
     * <code>DOUBLE</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setDouble(int parameterIndex, double x, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java <code>float</code> value. The driver converts this to an SQL
     * <code>REAL</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setFloat(int parameterIndex, float x, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>microsoft.sql.Geometry</code> Class object. The driver converts
     * this to an SQL <code>REAL</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setGeometry(int parameterIndex, Geometry x) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>microsoft.sql.Geography</code> Class object. The driver converts
     * this to an SQL <code>REAL</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setGeography(int parameterIndex, Geography x) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java <code>int</code> value. The driver converts this to an SQL
     * <code>INTEGER</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param value
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setInt(int parameterIndex, int value, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java <code>long</code> value. The driver converts this to an SQL
     * <code>BIGINT</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setLong(int parameterIndex, long x, boolean forceEncrypt) throws SQLServerException;

    /**
     * <p>
     * Sets the value of the designated parameter with the given object.
     *
     * <p>
     * The given Java object will be converted to the given targetSqlType before being sent to the database.
     *
     * If the object has a custom mapping (is of a class implementing the interface <code>SQLData</code>), the JDBC
     * driver should call the method <code>SQLData.writeSQL</code> to write it to the SQL data stream. If, on the other
     * hand, the object is of a class implementing <code>Ref</code>, <code>Blob</code>, <code>Clob</code>,
     * <code>NClob</code>, <code>Struct</code>, <code>java.net.URL</code>, or <code>Array</code>, the driver should pass
     * it to the database as a value of the corresponding SQL type.
     *
     * <p>
     * Note that this method may be used to pass database-specific abstract data types.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the object containing the input parameter value
     * @param targetSqlType
     *        the SQL type (as defined in java.sql.Types) to be sent to the database. The scale argument may further
     *        qualify this type.
     * @param precision
     *        the precision of the column
     * @param scale
     *        scale of the column
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setObject(int parameterIndex, Object x, int targetSqlType, Integer precision,
            int scale) throws SQLServerException;

    /**
     * <p>
     * Sets the value of the designated parameter with the given object.
     *
     * <p>
     * The given Java object will be converted to the given targetSqlType before being sent to the database.
     *
     * If the object has a custom mapping (is of a class implementing the interface <code>SQLData</code>), the JDBC
     * driver should call the method <code>SQLData.writeSQL</code> to write it to the SQL data stream. If, on the other
     * hand, the object is of a class implementing <code>Ref</code>, <code>Blob</code>, <code>Clob</code>,
     * <code>NClob</code>, <code>Struct</code>, <code>java.net.URL</code>, or <code>Array</code>, the driver should pass
     * it to the database as a value of the corresponding SQL type.
     *
     * <p>
     * Note that this method may be used to pass database-specific abstract data types.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the object containing the input parameter value
     * @param targetSqlType
     *        the SQL type (as defined in java.sql.Types) to be sent to the database. The scale argument may further
     *        qualify this type.
     * @param precision
     *        the precision of the column
     * @param scale
     *        scale of the column
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setObject(int parameterIndex, Object x, int targetSqlType, Integer precision, int scale,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java <code>short</code> value. The driver converts this to an SQL
     * <code>SMALLINT</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setShort(int parameterIndex, short x, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given Java <code>String</code> value. The driver converts this to an SQL
     * <code>VARCHAR</code> or <code>LONGVARCHAR</code> value (depending on the argument's size relative to the driver's
     * limits on <code>VARCHAR</code> values) when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param str
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setString(int parameterIndex, String str, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>String</code> object. The driver converts this to a SQL
     * <code>NCHAR</code> or <code>NVARCHAR</code> or <code>LONGNVARCHAR</code> value (depending on the argument's size
     * relative to the driver's limits on <code>NVARCHAR</code> values) when it sends it to the database.
     *
     * @param parameterIndex
     *        of the first parameter is 1, the second is 2, ...
     * @param value
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setNString(int parameterIndex, String value, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Time</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param scale
     *        the scale of the column
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setTime(int parameterIndex, java.sql.Time x, int scale) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Time</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param scale
     *        the scale of the column
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setTime(int parameterIndex, java.sql.Time x, int scale, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Timestamp</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param scale
     *        the scale of the column
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setTimestamp(int parameterIndex, java.sql.Timestamp x, int scale) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Timestamp</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param scale
     *        the scale of the column
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setTimestamp(int parameterIndex, java.sql.Timestamp x, int scale,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>microsoft.sql.DatetimeOffset</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param scale
     *        the scale of the column
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setDateTimeOffset(int parameterIndex, microsoft.sql.DateTimeOffset x,
            int scale) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>microsoft.sql.DatetimeOffset</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param scale
     *        the scale of the column
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setDateTimeOffset(int parameterIndex, microsoft.sql.DateTimeOffset x, int scale,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Timestamp</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setDateTime(int parameterIndex, java.sql.Timestamp x) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Timestamp</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setDateTime(int parameterIndex, java.sql.Timestamp x, boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Timestamp</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setSmallDateTime(int parameterIndex, java.sql.Timestamp x) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Timestamp</code> value
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setSmallDateTime(int parameterIndex, java.sql.Timestamp x,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * Populates a table valued parameter with a data table
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param tvpName
     *        the name of the table valued parameter
     * @param tvpDataTable
     *        the source datatable object
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setStructured(int parameterIndex, String tvpName,
            SQLServerDataTable tvpDataTable) throws SQLServerException;

    /**
     * Populates a table valued parameter with a data table
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param tvpName
     *        the name of the table valued parameter
     * @param tvpResultSet
     *        the source resultset object
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setStructured(int parameterIndex, String tvpName, ResultSet tvpResultSet) throws SQLServerException;

    /**
     * Populates a table valued parameter with a data table
     * 
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param tvpName
     *        the name of the table valued parameter
     * @param tvpBulkRecord
     *        an ISQLServerDataRecord object
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setStructured(int parameterIndex, String tvpName,
            ISQLServerDataRecord tvpBulkRecord) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Date</code> value, using the given
     * <code>Calendar</code> object. The driver uses the <code>Calendar</code> object to construct an SQL
     * <code>DATE</code> value, which the driver then sends to the database. With a <code>Calendar</code> object, the
     * driver can calculate the date taking into account a custom timezone. If no <code>Calendar</code> object is
     * specified, the driver uses the default timezone, which is that of the virtual machine running the application.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param cal
     *        the <code>Calendar</code> object the driver will use to construct the date
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setDate(int parameterIndex, java.sql.Date x, java.util.Calendar cal,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Time</code> value. The driver converts this to an SQL
     * <code>TIME</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param cal
     *        the <code>Calendar</code> object the driver will use to construct the date
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setTime(int parameterIndex, java.sql.Time x, java.util.Calendar cal,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * Sets the designated parameter to the given <code>java.sql.Timestamp</code> value. The driver converts this to an
     * SQL <code>TIMESTAMP</code> value when it sends it to the database.
     *
     * @param parameterIndex
     *        the first parameter is 1, the second is 2, ...
     * @param x
     *        the parameter value
     * @param cal
     *        the <code>Calendar</code> object the driver will use to construct the date
     * @param forceEncrypt
     *        If the boolean forceEncrypt is set to true, the query parameter will only be set if the designation column
     *        is encrypted and Always Encrypted is enabled on the connection or on the statement. If the boolean
     *        forceEncrypt is set to false, the driver will not force encryption on parameters.
     * @throws SQLServerException
     *         when an error occurs
     */
    public void setTimestamp(int parameterIndex, java.sql.Timestamp x, java.util.Calendar cal,
            boolean forceEncrypt) throws SQLServerException;

    /**
     * Returns parameter metadata for the prepared statement.
     * 
     * @param forceRefresh:
     *        If true the cache will not be used to retrieve the metadata.
     * 
     * @return Per the description.
     * 
     * @throws SQLServerException
     *         when an error occurs
     */
    public ParameterMetaData getParameterMetaData(boolean forceRefresh) throws SQLServerException;

}

package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_task_scopic_data_db_model_RealmItemRealmProxy extends com.task.scopic.data.db.model.RealmItem
    implements RealmObjectProxy, com_task_scopic_data_db_model_RealmItemRealmProxyInterface {

    static final class RealmItemColumnInfo extends ColumnInfo {
        long itemColKey;

        RealmItemColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmItem");
            this.itemColKey = addColumnDetails("item", "item", objectSchemaInfo);
        }

        RealmItemColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmItemColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmItemColumnInfo src = (RealmItemColumnInfo) rawSrc;
            final RealmItemColumnInfo dst = (RealmItemColumnInfo) rawDst;
            dst.itemColKey = src.itemColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmItemColumnInfo columnInfo;
    private ProxyState<com.task.scopic.data.db.model.RealmItem> proxyState;

    com_task_scopic_data_db_model_RealmItemRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmItemColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.task.scopic.data.db.model.RealmItem>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$item() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.itemColKey);
    }

    @Override
    public void realmSet$item(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'item' to null.");
            }
            row.getTable().setString(columnInfo.itemColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'item' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.itemColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "RealmItem", false, 1, 0);
        builder.addPersistedProperty(NO_ALIAS, "item", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmItemColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmItemColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmItem";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmItem";
    }

    @SuppressWarnings("cast")
    public static com.task.scopic.data.db.model.RealmItem createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.task.scopic.data.db.model.RealmItem obj = realm.createObjectInternal(com.task.scopic.data.db.model.RealmItem.class, true, excludeFields);

        final com_task_scopic_data_db_model_RealmItemRealmProxyInterface objProxy = (com_task_scopic_data_db_model_RealmItemRealmProxyInterface) obj;
        if (json.has("item")) {
            if (json.isNull("item")) {
                objProxy.realmSet$item(null);
            } else {
                objProxy.realmSet$item((String) json.getString("item"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.task.scopic.data.db.model.RealmItem createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.task.scopic.data.db.model.RealmItem obj = new com.task.scopic.data.db.model.RealmItem();
        final com_task_scopic_data_db_model_RealmItemRealmProxyInterface objProxy = (com_task_scopic_data_db_model_RealmItemRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("item")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$item((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$item(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_task_scopic_data_db_model_RealmItemRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmItem.class), false, Collections.<String>emptyList());
        io.realm.com_task_scopic_data_db_model_RealmItemRealmProxy obj = new io.realm.com_task_scopic_data_db_model_RealmItemRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.task.scopic.data.db.model.RealmItem copyOrUpdate(Realm realm, RealmItemColumnInfo columnInfo, com.task.scopic.data.db.model.RealmItem object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.task.scopic.data.db.model.RealmItem) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.task.scopic.data.db.model.RealmItem copy(Realm realm, RealmItemColumnInfo columnInfo, com.task.scopic.data.db.model.RealmItem newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.task.scopic.data.db.model.RealmItem) cachedRealmObject;
        }

        com_task_scopic_data_db_model_RealmItemRealmProxyInterface unmanagedSource = (com_task_scopic_data_db_model_RealmItemRealmProxyInterface) newObject;

        Table table = realm.getTable(com.task.scopic.data.db.model.RealmItem.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.itemColKey, unmanagedSource.realmGet$item());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_task_scopic_data_db_model_RealmItemRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.task.scopic.data.db.model.RealmItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.task.scopic.data.db.model.RealmItem.class);
        long tableNativePtr = table.getNativePtr();
        RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmItem.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$item = ((com_task_scopic_data_db_model_RealmItemRealmProxyInterface) object).realmGet$item();
        if (realmGet$item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.itemColKey, objKey, realmGet$item, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.task.scopic.data.db.model.RealmItem.class);
        long tableNativePtr = table.getNativePtr();
        RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmItem.class);
        com.task.scopic.data.db.model.RealmItem object = null;
        while (objects.hasNext()) {
            object = (com.task.scopic.data.db.model.RealmItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$item = ((com_task_scopic_data_db_model_RealmItemRealmProxyInterface) object).realmGet$item();
            if (realmGet$item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.itemColKey, objKey, realmGet$item, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.task.scopic.data.db.model.RealmItem object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.task.scopic.data.db.model.RealmItem.class);
        long tableNativePtr = table.getNativePtr();
        RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmItem.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$item = ((com_task_scopic_data_db_model_RealmItemRealmProxyInterface) object).realmGet$item();
        if (realmGet$item != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.itemColKey, objKey, realmGet$item, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.itemColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.task.scopic.data.db.model.RealmItem.class);
        long tableNativePtr = table.getNativePtr();
        RealmItemColumnInfo columnInfo = (RealmItemColumnInfo) realm.getSchema().getColumnInfo(com.task.scopic.data.db.model.RealmItem.class);
        com.task.scopic.data.db.model.RealmItem object = null;
        while (objects.hasNext()) {
            object = (com.task.scopic.data.db.model.RealmItem) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$item = ((com_task_scopic_data_db_model_RealmItemRealmProxyInterface) object).realmGet$item();
            if (realmGet$item != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.itemColKey, objKey, realmGet$item, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.itemColKey, objKey, false);
            }
        }
    }

    public static com.task.scopic.data.db.model.RealmItem createDetachedCopy(com.task.scopic.data.db.model.RealmItem realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.task.scopic.data.db.model.RealmItem unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.task.scopic.data.db.model.RealmItem();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.task.scopic.data.db.model.RealmItem) cachedObject.object;
            }
            unmanagedObject = (com.task.scopic.data.db.model.RealmItem) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_task_scopic_data_db_model_RealmItemRealmProxyInterface unmanagedCopy = (com_task_scopic_data_db_model_RealmItemRealmProxyInterface) unmanagedObject;
        com_task_scopic_data_db_model_RealmItemRealmProxyInterface realmSource = (com_task_scopic_data_db_model_RealmItemRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$item(realmSource.realmGet$item());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmItem = proxy[");
        stringBuilder.append("{item:");
        stringBuilder.append(realmGet$item());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_task_scopic_data_db_model_RealmItemRealmProxy aRealmItem = (com_task_scopic_data_db_model_RealmItemRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmItem.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmItem.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmItem.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}

package fastfd_helper;

import fastfd_helper.BitSetUtil;

import java.io.Serializable;

import org.apache.lucene.util.OpenBitSet;

public class AgreeSet extends StorageSet implements Serializable{

    protected OpenBitSet attributes = new OpenBitSet();

    public void add(int attribute) {

        this.attributes.set(attribute);
    }

    public OpenBitSet getAttributes() {

        return this.attributes.clone();

    }

    @Override
    public String toString_() {

        return "ag(" + BitSetUtil.convertToIntList(this.attributes).toString()
                + ")";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((attributes == null) ? 0 : attributes.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AgreeSet other = (AgreeSet) obj;
        if (attributes == null) {
            if (other.attributes != null)
                return false;
        } else if (!attributes.equals(other.attributes))
            return false;
        return true;
    }

}

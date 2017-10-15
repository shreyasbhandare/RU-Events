package com.shreyasbhandare.ruevents.Model.POJO;

public class PageList
{
    private Data[] data;

    private Paging paging;

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    public Paging getPaging ()
    {
        return paging;
    }

    public void setPaging (Paging paging)
    {
        this.paging = paging;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", paging = "+paging+"]";
    }

    public class Paging
    {
        private Cursors cursors;

        public Cursors getCursors ()
        {
            return cursors;
        }

        public void setCursors (Cursors cursors)
        {
            this.cursors = cursors;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [cursors = "+cursors+"]";
        }
    }

    public class Cursors
    {
        private String after;

        private String before;

        public String getAfter ()
        {
            return after;
        }

        public void setAfter (String after)
        {
            this.after = after;
        }

        public String getBefore ()
        {
            return before;
        }

        public void setBefore (String before)
        {
            this.before = before;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [after = "+after+", before = "+before+"]";
        }
    }

    public class Data
    {
        private String id;

        private Cover cover;

        private String name;

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public Cover getCover ()
        {
            return cover;
        }

        public void setCover (Cover cover)
        {
            this.cover = cover;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [id = "+id+", cover = "+cover+", name = "+name+"]";
        }
    }

    public class Cover
    {
        private String id;

        private String source;

        private String cover_id;

        private String offset_y;

        private String offset_x;

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getSource ()
        {
            return source;
        }

        public void setSource (String source)
        {
            this.source = source;
        }

        public String getCover_id ()
        {
            return cover_id;
        }

        public void setCover_id (String cover_id)
        {
            this.cover_id = cover_id;
        }

        public String getOffset_y ()
        {
            return offset_y;
        }

        public void setOffset_y (String offset_y)
        {
            this.offset_y = offset_y;
        }

        public String getOffset_x ()
        {
            return offset_x;
        }

        public void setOffset_x (String offset_x)
        {
            this.offset_x = offset_x;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [id = "+id+", source = "+source+", cover_id = "+cover_id+", offset_y = "+offset_y+", offset_x = "+offset_x+"]";
        }
    }
}


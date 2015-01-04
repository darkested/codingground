public class MapperBuilder {
    private Mapper mapper;
    
    public MapperBuilder() {
        mapper = new Mapper();
    }
    
    public MapperBuilder from(Object objIn) {
        mapper.setFrom(objIn);
        return this;
    }
    
    public MapperBuilder to(Object objOut) {
        mapper.setTo(objOut);
        return this;
    }
    
    public Mapper build() {
       return mapper.getFrom() + mapper.getTo(); 
    }
}
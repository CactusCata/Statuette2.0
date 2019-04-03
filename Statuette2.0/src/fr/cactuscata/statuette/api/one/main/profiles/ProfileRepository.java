package fr.cactuscata.statuette.api.one.main.profiles;

public interface ProfileRepository {
    public Profile[] findProfilesByNames(String... names);
}

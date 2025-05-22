package interfaces;

import auths.AuthCredentials;

//Sudah menerapkan Interface Segregation, dengan tidak menambahkan function2 yang tidak ada hubungan atau tidak dipakai
public interface ILogin {
	public boolean authenticate(AuthCredentials credentials);
}
